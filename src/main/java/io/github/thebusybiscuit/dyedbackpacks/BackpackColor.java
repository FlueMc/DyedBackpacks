package io.github.thebusybiscuit.dyedbackpacks;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;

public enum BackpackColor {

    WHITE("&rWhite", Material.WHITE_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWJkZjhkNTNiZGI5MzJjMjIzYzYyN2JiYjhjMWUwYzVlMzUxYTYxNmNkODA1NjkyOWM2NmU2ZGNlNDQ0MzNkYiJ9fX0="),
    ORANGE("&6Orange", Material.ORANGE_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTM3YTM1NTIyZjY3YjJhZjkyMzQ1NTkyODQ2YjcwMmI5YWZiOWQ3YzhkYmFkNWVhMTUwNjczYzllNDRkZTMifX19"),
    MAGENTA("&dMagenta", Material.MAGENTA_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY1NzVmY2NjYWRhZTg3YzA4NDJmNTNkZTVlMGZmYTc1ODUxNjk2ODY2ZDgxZTFiNzI4MjgzNDhkYjUyNTYifX19"),
    LIGHT_BLUE("&bLight Blue", Material.LIGHT_BLUE_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNjMTUzYzM5MWMzNGUyZDMyOGE2MDgzOWU2ODNhOWY4MmFkMzA0ODI5OWQ4YmM2YTM5ZTZmOTE1Y2M1YSJ9fX0="),
    YELLOW("&eYellow", Material.YELLOW_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTI1NGFhY2JmNjIzMTc1ZmY5OGRmN2FlMzY2ZTBiODllOTE3MTM0NDE3NTJmM2NkZjk2NWYwMzhiMTc0YjUifX19"),
    LIME("&aLime", Material.LIME_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk5MDlhOTc3OWI5NDZiOTc4NzQ0MmZhNDgzYWY0ZGU0YjJmMTlmZDQwZGMyMzcwZjdhOWI4ZjUyMWYyMWRkYyJ9fX0"),
    PINK("&dPink", Material.PINK_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmRkYWZkY2IxYThkZjQyNjIyOWQ3ODc5YjFlNGEzMzZmYzlhYjNiZGMxNDZiYjRlZDNiZTRiYmY3YjViODM1In19fQ=="),
    DARK_GRAY("&8Dark Gray", Material.GRAY_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjUzNmFkOTc4ZTFjZTUwNTBmNDNiN2E2YjM4NTllYjQ5NDA2YjRmMTA0MzgwMmE3MTFjZGM4MGMwOTBjMzVkIn19fQ=="),
    LIGHT_GRAY("&7Light Gray", Material.LIGHT_GRAY_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE1ZmM3NjM1Mjk2Y2ExODNmZDMwYjBmYjVmNGMxOGNmYzIxNjc2OGYwZmJlYmI4NjVlMDIxMWFiNDNiN2IifX19"),
    CYAN("&3Cyan", Material.CYAN_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY3MGZhYjMyNDZmZTAyN2NlMGJiYTg4NWE3M2M2ZTgyZDhmZjhmMzU4MjMxZTg0NjFmOTU2NTYwY2ZhNThmIn19fQ=="),
    PURPLE("&5Purple", Material.PURPLE_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWViNjViYmU3NDQ5NDU4NDFlOTIzNGEzM2I1Y2U1Y2MyMzZmNmEyZmM5M2ExYTNhZTQyZGY3N2M5MDg0ZGYxZSJ9fX0="),
    BLUE("&1Blue", Material.BLUE_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODIyNGIyYzczOTFlYjViZmNiMjc4NDMxZDVjODI3Y2IyNjM0OTUyNmM3YmM1MzViMWU5NWY2ZGY5ZjNmZGYzIn19fQ=="),
    BROWN("&6Brown", Material.BROWN_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWZiNmEzZDdkYmE5N2JiNmU3Zjc5YTE1NjI3YWVjNjM2OTc5MTIzM2Y4MzNmYTc0OWVmMjFiZWQ3OWU1OWU5OCJ9fX0="),
    GREEN("&2Green", Material.GREEN_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjhhMTI3ZjFjZmQ3OTk4NmU3YmQ5NWQ5MmRlNGY0ZjY4MDQwZTRmODk5ZjgxYjFmOGYzY2ExNWI2NGY1MGYzIn19fQ=="),
    RED("&4Red", Material.RED_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODVlNGY5ZGE2OGM4MWZhNDgxZWVjZGNhNDhhMTM4Y2VjZGUyY2RkZmZlZWFlODRhYjFhZmQyNGEzNjNlMDI4In19fQ=="),
    BLACK("&8Black", Material.BLACK_WOOL, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTlhYjFmZGNiZTg3OGQxZTU1YmRkNDNjZWJjNWU0MzgzNmE2ZGE2OTU0MWY0YTIzM2ZlODhmMTMwNTY2OCJ9fX0=");

    private final String name;
    private final Material wool;
    private final String texture;

    @ParametersAreNonnullByDefault
    BackpackColor(String name, Material wool, String texture) {
        this.name = name;
        this.wool = wool;
        this.texture = texture;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public String getTexture() {
        return texture;
    }

    @Nonnull
    public Material getWoolMaterial() {
        return wool;
    }

}
