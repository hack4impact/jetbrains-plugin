<h1 align="center">
  <br>
    <a href="https://hack4impact.org/"><img src="https://raw.githubusercontent.com/YashTotale/jetbrains-plugin/main/src/main/resources/icons/rotating-icon.gif" alt="Hack4Impact Icon" width="100"></a>
  <br>
  <b><a href="https://hack4impact.org/">Hack4Impact</a>'s JetBrains Recommendations</b>
</h1>

![Build](https://github.com/YashTotale/jetbrains-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)


<!-- Plugin description -->
Hack4Impact's JetBrains plugin that provides recommended templates for quality project development:

- ESLint Configuration (`.eslintrc.json`)
- Prettier Configuration (`.prettierrc.json`)
- MarkdownLint Configuration (`.markdownlint.json`)
- EditorConfig Configuration (`.editorconfig`)
- GitIgnore (`.gitignore`)
- Changelog (`CHANGELOG.md`)
- License (`LICENSE.md`)
<!-- Plugin description end -->
## Template ToDo list

- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate)
  for the first time.
- [ ] Set the Plugin ID in the above README badges.
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

`hack4impact.template.create`

#### Description

- Opens a Dialog to choose the templates that should be created
- Shows a File Picker Dialog to pick the folder where the templates should be created
- Creates the templates with Hack4Impact's recommended configuration

---

### Create ESLint Configuration Template

#### Action ID

`hack4impact.template.create.ESLintConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.eslintrc.json` file should be created
- Creates a `.eslintrc.json` file with Hack4Impact's recommended configuration

---

### Create Prettier Configuration Template

#### Action ID

`hack4impact.template.create.PrettierConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.prettierrc.json` file should be created
- Creates a `.prettierrc.json` file with Hack4Impact's recommended configuration

---

### Create MarkdownLint Configuration Template

#### Action ID

`hack4impact.template.create.MarkdownLintConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.markdownlint.json` file should be created
- Creates a `.markdownlint.json` file with Hack4Impact's recommended configuration

---

### Create EditorConfig Configuration Template

#### Action ID

`hack4impact.template.create.EditorConfigConfig`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.editorconfig` file should be created
- Creates a `.editorconfig` file with Hack4Impact's recommended configuration

---

### Create GitIgnore Template

#### Action ID

`hack4impact.template.create.GitIgnore`

#### Description

- Shows a File Picker Dialog to pick the folder where a `.gitignore` file should be created
- Creates a boilerplate `.gitignore` file

---

### Create Changelog Template

#### Action ID

`hack4impact.template.create.Changelog`

#### Description

- Shows a File Picker Dialog to pick the folder where a `CHANGELOG.md` file should be created
- Creates a boilerplate `CHANGELOG.md` file

---

### Create License Template

#### Action ID

`hack4impact.template.create.License`

#### Description

- Shows a File Picker Dialog to pick the folder where a `LICENSE.md` file should be created
- Creates a boilerplate `LICENSE.md` file