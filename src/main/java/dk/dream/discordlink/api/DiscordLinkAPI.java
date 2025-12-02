package dk.dream.discordlink.api;

import java.util.UUID;

@SuppressWarnings("unused")
public interface DiscordLinkAPI {

    String getDiscordId(UUID uuid);

    UUID getMinecraftUUID(String discordId);

    boolean isLinked(UUID uuid);

    void link(UUID uuid, String discordId);

    void unlink(UUID uuid);

    void giveRole(String discordId, String roleId);

    void removeRole(String discordId, String roleId);

    void clearNickname(String discordId);

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