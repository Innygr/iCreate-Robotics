# iCreate: Robotics

An experimental Create addon for Minecraft 1.21.1 on NeoForge.

## Alpha.1 contents
- Three registered component items: Robotics Core, Robot Chassis, and Robotic Arm.
- Provisional crafting recipes for the component chain.
- Distinct vanilla placeholder icons and in-game tooltips explaining each component's intended role and unfinished behavior.
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

## Alpha verification checklist
- [ ] Start a client with the matching Minecraft, NeoForge, and Create versions.
- [ ] Confirm the iCreate: Robotics creative tab appears and all three items have names, icons, and tooltips.
- [ ] Craft the Robotics Core, Robot Chassis, and Robotic Arm recipes in survival.
- [ ] Start a dedicated server with the same mod set and confirm startup completes.
- [ ] Check latest.log for missing model, texture, or translation warnings.

Do not submit a public Modrinth file until the client and dedicated-server checks are completed. GitHub Actions uploads the built JAR as a short-lived workflow artifact.

## Build
With Java 21 and Gradle 8.12, run `gradle --no-daemon build`.

## License
MIT. See [LICENSE](LICENSE).
