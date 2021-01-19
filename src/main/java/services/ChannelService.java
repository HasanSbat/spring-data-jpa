package services;

import model.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ChannelRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChannelService {
    @Autowired
    private ChannelRepository channelRepository;

    public Optional<Channel> getChannelById(Integer id) {
        return channelRepository.findById(id);
    }

    public Optional<Channel> getChannelByAdminId(Integer id) {
        return channelRepository.findByAdminId(id);
    }

    public Optional<Channel> getChannelByParentId(Integer id) {
        return channelRepository.findByParentId(id);
    }
    public Optional<Channel> getChannelTeacherId(Integer id){
        return channelRepository.findByTeacherId(id);
    }
    public void createChannelByAdmin(Channel channel){
        channelRepository.save(channel);
    }
    public void editChannel(Channel channel, Integer id){
        Channel newChannel = channelRepository.findById(id).get();
        newChannel.setId(id);
        channelRepository.save(channel);
    }
    public List<Channel> getAllChannels(){
        List<Channel> channelList = new ArrayList<>();
        channelRepository.findAll().forEach(channel -> channelList.add(channel));
        return channelList;
    }


}