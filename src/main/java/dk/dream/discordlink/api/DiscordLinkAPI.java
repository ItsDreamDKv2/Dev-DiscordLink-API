package dk.dream.discordlink.api;

import java.util.UUID;

@SuppressWarnings("unused")
public interface DiscordLinkAPI {

    String getDiscordId(UUID uuid);

    UUID getMinecraftUUID(String discordId);

    void unlink(UUID uuid);

    void setNickname(String discordId, String nickname);

    void moveToChannel(String discordId, String channelId);

    static DiscordLinkAPI get() {
        return ProviderHolder.provider;
    }

    static void setProvider(DiscordLinkAPI provider) {
        ProviderHolder.provider = provider;
    }

    class ProviderHolder {
        private static DiscordLinkAPI provider;
    }
}