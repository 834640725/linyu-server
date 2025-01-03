package com.cershy.linyuserver.service;

import com.cershy.linyuserver.dto.ChatListDto;
import com.cershy.linyuserver.entity.ChatList;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cershy.linyuserver.entity.ext.MsgContent;
import com.cershy.linyuserver.vo.chatlist.CreateChatListVo;
import com.cershy.linyuserver.vo.chatlist.DeleteChatListVo;
import com.cershy.linyuserver.vo.chatlist.DetailChatListVo;
import com.cershy.linyuserver.vo.chatlist.TopChatListVo;

/**
 * <p>
 * 聊天列表 服务类
 * </p>
 *
 * @author heath
 * @since 2024-05-18
 */
public interface ChatListService extends IService<ChatList> {

    ChatListDto getChatList(String userId);

    void updateChatList(String toUserId, String fromUserId, MsgContent msgContent, String type);

    ChatList createChatList(String userId, String role, CreateChatListVo createChatListVo);

    boolean messageRead(String userId, String targetId);

    ChatList detailChartList(String userId, DetailChatListVo detailChatListVo);

    boolean deleteChatList(String userId, DeleteChatListVo deleteChatListVo);

    boolean topChatList(String userId, TopChatListVo topChatListVo);

    int unread(String userId);

    ChatList getChatListByUserIdAndFromId(String userId, String fromId);

    boolean messageReadAll(String userId);

    void updateChatListGroup(String groupId, MsgContent msgContent);

    void removeByUserId(String userId, String friendId);
}
