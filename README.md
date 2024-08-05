<!--
TinkerMaterialDumperMod
placeholder
-->
<a id="readme-top"></a>

<!-- shields -->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stars][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![GNU GPLv3][license-shield]][license-url]

<!-- readme head -->
<h3 align="center">TinkerMaterialDumperMod</h3>

  <p align="center">
    Mod that adds a command that dumps all the tinker registry material stats to a CSV. Works with Construct's Armory.
    <br />
    <a href="https://github.com/usbhub95/TinkerMaterialDumperMod/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/usbhub95/TinkerMaterialDumperMod/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

I created this after discovering the limitations of ZenScript regarding this problem (No real ConArm support or traits support).

<!-- GETTING STARTED -->
## Getting Started

To use this mod, a few other mods are required.

### Prerequisites

*   [Tinker's Construct](https://www.curseforge.com/minecraft/mc-mods/tinkers-construct)
*   [Construct's Armory](https://www.curseforge.com/minecraft/mc-mods/constructs-armory)

### Installation

Just download the latest release and put it into your mods folder.  
To develop the mod, install the dev environment as follows:
1.  Clone or download the repository
2.  If your IDE has Gradle integration, open the repository with it. Otherwise enter the command `gradlew setupDecompWorkspace` to set it up
3.  Run the commands `gradlew runClient` and `gradlew runServer` to run the dev env minecraft client or server respectively

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

To use the mod, load up a world and type any of the following commands:
```
/ticmatdump
/dumptinkermaterials
/tinkermaterialdump
/dumptinkermats
/tinkermatdump
/dumpticmats
/dtm
/tmd
```
A `stats.csv` will be created inside the `.minecraft` root folder.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->
## License

My code is distributed under the GNU GPLv3 License. See `LICENSE` for more information.  
Everything from the template is distributed under the MIT License. See `LICENSE_CLEANROOM` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Cooper Lockrey - cooper.lockrey@gmail.com

Project Link: [https://github.com/usbhub95/TinkerMaterialDumperMod](https://github.com/usbhub95/TinkerMaterialDumperMod)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [CleanroomMC/TemplateDevEnv](https://github.com/CleanroomMC/TemplateDevEnv)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
[contributors-shield]: https://img.shields.io/github/contributors/usbhub95/TinkerMaterialDumperMod.svg?style=for-the-badge
[contributors-url]: https://github.com/usbhub95/TinkerMaterialDumperMod/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/usbhub95/TinkerMaterialDumperMod.svg?style=for-the-badge
[forks-url]: https://github.com/usbhub95/TinkerMaterialDumperMod/network/members
[stars-shield]: https://img.shields.io/github/stars/usbhub95/TinkerMaterialDumperMod.svg?style=for-the-badge
[stars-url]: https://github.com/usbhub95/TinkerMaterialDumperMod/stargazers
[issues-shield]: https://img.shields.io/github/issues/usbhub95/TinkerMaterialDumperMod.svg?style=for-the-badge
[issues-url]: https://github.com/usbhub95/TinkerMaterialDumperMod/issues
[license-shield]: https://img.shields.io/github/license/usbhub95/TinkerMaterialDumperMod.svg?style=for-the-badge
[license-url]: https://github.com/usbhub95/TinkerMaterialDumperMod/blob/master/LICENSE.txt