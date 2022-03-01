package com.ntds.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
import javax.security.auth.login.LoginException;

@Service
public class DiscordBotService extends ListenerAdapter {
    private final long channelId = 915918614064947204L;

    @EventListener(ApplicationReadyEvent.class)
    public void botService () throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("OTE1OTE3NzAxODg3NzAxMDIy.Yaik1Q.KcMA6uiYc0g7XsoMDSnUopRqudk");
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES)
                .setBulkDeleteSplittingEnabled(false)
                .setCompression(Compression.NONE)
                .setActivity(Activity.watching("TV"))
                .addEventListeners(new DiscordBotService())
                .build();
    }

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) throws NullPointerException {
        TextChannel channel = event.getJDA().getTextChannelById(channelId);
        System.out.println("messageRecieved");
        if (!event.getAuthor().isBot()) {
            channel.sendMessage(event.getMessage()).queue();
        }
    }
}
