<h1 align="center">
  <br>
    <a href="https://hack4impact.org/"><img src="https://raw.githubusercontent.com/YashTotale/jetbrains-plugin/main/src/main/resources/icons/rotating-icon.gif" alt="Hack4Impact Icon" width="100"></a>
  <br>
  <b><a href="https://hack4impact.org/">Hack4Impact</a>'s JetBrains Recommendations</b>
</h1>

<p align="center">
<a href="https://github.com/YashTotale/jetbrains-plugin/actions/workflows/build.yml?query=workflow%3A%22CI%22"><img src="https://img.shields.io/github/workflow/status/YashTotale/jetbrains-plugin/CI?style=flat-square&label=Build&logo=github&logoColor=FFFFFF&labelColor=000000" alt="Build"/></a>
</p>

<!-- Plugin description -->
Hack4Impact's JetBrains plugin that provides recommended templates for quality project development:

- ESLint Configuration (`.eslintrc.json`)
- Prettier Configuration (`.prettierrc.json`)
- MarkdownLint Configuration (`.markdownlint.json`)
- EditorConfig Configuration (`.editorconfig`)
- GitIgnore (`.gitignore`)
- Changelog (`CHANGELOG.md`)
- License (`LICENSE.md`)

If you use VS Code instead, install the [VS Code Extension](https://github.com/hack4impact/vscode-extension).
<!-- Plugin description end -->

## Contents <!-- omit in toc -->

- [Installation](#installation)
- [Actions](#actions)
  - [Create Template Files](#create-template-files)
  - [Create ESLint Configuration Template](#create-eslint-configuration-template)
  - [Create Prettier Configuration Template](#create-prettier-configuration-template)
  - [Create MarkdownLint Configuration Template](#create-markdownlint-configuration-template)
  - [Create EditorConfig Configuration Template](#create-editorconfig-configuration-template)
  - [Create GitIgnore Template](#create-gitignore-template)
  - [Create Changelog Template](#create-changelog-template)
  - [Create License Template](#create-license-template)

## TODO

- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate)
  for the first time.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).

## Installation

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Hack4Impact's
  Recommendations"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/YashTotale/jetbrains-plugin/releases/latest) and install it manually
  using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Actions

### Create Template Files

#### Action ID

`hack4impact.templates.create`

#### Description

- Opens a Dialog to choose the templates that should be created
- Shows a File Picker Dialog to pick the folder where the templates should be created
- Creates the templates with Hack4Impact's recommended configuration

---

### Create ESLint Configuration Template

#### Action ID

`hack4impact.templates.create.ESLintConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.eslintrc.json` file should be created
- Creates a `.eslintrc.json` file with Hack4Impact's recommended configuration

---

### Create Prettier Configuration Template

#### Action ID

`hack4impact.templates.create.PrettierConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.prettierrc.json` file should be created
- Creates a `.prettierrc.json` file with Hack4Impact's recommended configuration

---

### Create MarkdownLint Configuration Template

#### Action ID

`hack4impact.templates.create.MarkdownLintConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.markdownlint.json` file should be created
- Creates a `.markdownlint.json` file with Hack4Impact's recommended configuration

---

### Create EditorConfig Configuration Template

#### Action ID

`hack4impact.templates.create.EditorConfigConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.editorconfig` file should be created
- Creates a `.editorconfig` file with Hack4Impact's recommended configuration

---

### Create GitIgnore Template

#### Action ID

`hack4impact.templates.create.GitIgnore`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.gitignore` file should be created
- Creates a boilerplate `.gitignore` file

---

### Create Changelog Template

#### Action ID

`hack4impact.templates.create.Changelog`

#### Description

- Shows a File Picker Dialog to pick the folder where a `CHANGELOG.md` file should be created
- Creates a boilerplate `CHANGELOG.md` file

---

### Create License Template

#### Action ID

`hack4impact.templates.create.License`

#### Description

- Shows a File Picker Dialog to pick the folder where a `LICENSE.md` file should be created
- Creates a boilerplate `LICENSE.md` file

## Contributors

Project Contributors ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/YashTotale"><img src="https://avatars.githubusercontent.com/u/30784592?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Yash Totale</b></sub></a><br /><a href="https://github.com/YashTotale/jetbrains-plugin/commits?author=YashTotale" title="Code">💻</a> <a href="#ideas-YashTotale" title="Ideas, Planning, & Feedback">🤔</a> <a href="https://github.com/YashTotale/jetbrains-plugin/commits?author=YashTotale" title="Documentation">📖</a></td>
    <td align="center"><a href="https://bholmes.dev/"><img src="https://avatars.githubusercontent.com/u/31811199?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Benjamin Holmes</b></sub></a><br /><a href="#mentoring-Holben888" title="Mentoring">🧑‍🏫</a> <a href="#ideas-Holben888" title="Ideas, Planning, & Feedback">🤔</a> <a href="#projectManagement-Holben888" title="Project Management">📆</a></td>
    <td align="center"><a href="https://www.linkedin.com/in/eric-newcomer/"><img src="https://avatars.githubusercontent.com/u/20120289?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Eric Newcomer</b></sub></a><br /><a href="#mentoring-eric-newcomer" title="Mentoring">🧑‍🏫</a> <a href="#projectManagement-eric-newcomer" title="Project Management">📆</a></td>
  </tr>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
