package services;

import model.Message;
import model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MessageRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void createMessage(Message message){
        messageRepository.save(message);
    }
    public void editMessage(Message message, Integer id){
        Message newMessage= messageRepository.findById(id).get();
        newMessage.setId(id);
        messageRepository.save(newMessage);
    }
    public List<Message> getAllMessages(){
        List<Message> list = new ArrayList<>();
        messageRepository.findAll().forEach(message -> list.add(message));
        return  list;
    }
    public Optional<Message> getMessageById(Integer id){
        return messageRepository.findById(id);
    }

    public Optional<Message> findMessageByAdminId(Integer id){
        return messageRepository.findAllByAdminId(id);
    }
    public Optional<Message> findMessageByParentId(Integer id){
        return messageRepository.findAllByParentId(id);
    }
    public Optional<Message> findMessageByTeacherId(Integer id){
        return messageRepository.findAllByTeacherId(id);
    }
}

