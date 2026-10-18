# iCreate: Robotics

An experimental Create addon for Minecraft 1.21.1 on NeoForge.

## Alpha.1 contents
- Three registered component items: Robotics Core, Robot Chassis, and Robotic Arm.
- Provisional crafting recipes for the component chain.
- Distinct vanilla placeholder icons so the components are visible before custom textures are integrated.
- GitHub Actions build with a downloadable development JAR artifact.

## Not implemented yet
- Robot entities or deployable robots.
- Autonomous movement, work tasks, and factory interaction.
- Robot upgrades, behavior configuration, and advanced automation.
- Custom textures, sounds, and in-game balancing.

## Compatibility
- Minecraft 1.21.1
- NeoForge 21.1.x (built against 21.1.251)
- Java 21
- Intended Create integration: 6.0.x

This is a development alpha, not a finished robotics system. Back up worlds before testing and do not assume planned features are available.

## Build
With Java 21 and Gradle 8.12, run `gradle --no-daemon build`. GitHub Actions uploads the built JAR as a short-lived workflow artifact. Test the artifact in both a client and a dedicated server before considering a Modrinth release.

## License
MIT. See [LICENSE](LICENSE).
