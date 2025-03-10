/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.aleshin.features.settings.impl.presentation.theme.tokens

import androidx.compose.runtime.staticCompositionLocalOf
import ru.aleshin.core.ui.theme.tokens.TimePlannerLanguage

/**
 * @author Stanislav Aleshin on 17.02.2023.
 */
internal data class SettingsStrings(
    val settingsTitle: String,
    val mainSettingsTitle: String,
    val mainSettingsThemeTitle: String,
    val darkThemeTitle: String,
    val lightThemeTitle: String,
    val systemThemeTitle: String,
    val mainSettingsLanguageTitle: String,
    val rusLanguageTitle: String,
    val engLanguageTitle: String,
    val gerLanguageTitle: String,
    val spaLanguageTitle: String,
    val perLanguageTitle: String,
    val freLanguageTitle: String,
    val defaultLanguageTitle: String,
    val backIconDesc: String,
    val moreIconDesc: String,
    val resetToDefaultTitle: String,
    val menuIconDesc: String,
    val dataSectionHeader: String,
    val clearDataTitle: String,
    val clearDataButtonTitle: String,
    val clearDataWarning: String,
    val backupDataTitle: String,
    val backupDataButtonTitle: String,
    val restoreDataButtonTitle: String,
    val errorBackupMessage: String,
    val errorBackupFileMessage: String,
    val otherError: String,
    val mainSettingsDynamicColorTitle: String,
    val aboutAppHeader: String,
    val versionCodeTitle: String,
    val versionNameTitle: String,
    val developerTitle: String,
    val licenseTitle: String,
    val githubTitle: String,
    val askQuestionTitle: String,
    val donateTitle: String,
    val copyTitle: String,
    val mainSettingsColorsTitle: String,
    val donateHeader: String,
    val secureSectionHeader: String,
    val secureModeTitle: String,
    val interfaceSectionHeader: String,
    val calendarButtonBehaviorTitle: String,
    val currentDayCalendarBehavior: String,
    val selectDayCalendarBehavior: String,
    val ptLanguageTitle: String,
)

internal val russianSettingsString = SettingsStrings(
    settingsTitle = "Настройки",
    mainSettingsTitle = "Основные настройки",
    mainSettingsThemeTitle = "Тема:",
    darkThemeTitle = "Тёмная",
    lightThemeTitle = "Светлая",
    systemThemeTitle = "Системная",
    mainSettingsLanguageTitle = "Язык приложения",
    rusLanguageTitle = "Русский",
    engLanguageTitle = "Английский",
    gerLanguageTitle = "Немецкий",
    spaLanguageTitle = "Испанский",
    perLanguageTitle = "Персидский(b)",
    freLanguageTitle = "Французкий",
    ptLanguageTitle = "Португальский",
    defaultLanguageTitle = "По умолчанию",
    backIconDesc = "Назад",
    moreIconDesc = "Дополнительно",
    resetToDefaultTitle = "По умолчанию",
    menuIconDesc = "Меню",
    dataSectionHeader = "Данные",
    clearDataTitle = "Удалить все данные",
    clearDataButtonTitle = "Очистить",
    clearDataWarning = "Данное действие приведёт к полной очистке данных приложения!",
    backupDataTitle = "Резервная копия",
    backupDataButtonTitle = "Сохранить",
    restoreDataButtonTitle = "Восстановить",
    errorBackupMessage = "Ошибка резервного копирования",
    errorBackupFileMessage = "Ошибка при работе с файлом",
    otherError = "Ошибка! Обратитесь к разработчику.",
    mainSettingsDynamicColorTitle = "Динамические цвета",
    aboutAppHeader = "О приложении",
    versionCodeTitle = "Номер сборки",
    versionNameTitle = "Версия",
    developerTitle = "Разработчик",
    licenseTitle = "Лицензия",
    githubTitle = "Github",
    askQuestionTitle = "Задать вопрос",
    donateTitle = "Поддержать приложение",
    copyTitle = "Копировать",
    mainSettingsColorsTitle = "Цвет",
    donateHeader = "Донат",
    secureSectionHeader = "Безопасность",
    secureModeTitle = "Безопасный режим",
    interfaceSectionHeader = "Интерфейс",
    calendarButtonBehaviorTitle = "Поведение кнопки календаря",
    currentDayCalendarBehavior = "Текущий день",
    selectDayCalendarBehavior = "Выбор дня",
)

internal val englishSettingsString = SettingsStrings(
    settingsTitle = "Settings",
    mainSettingsTitle = "General settings",
    mainSettingsThemeTitle = "Theme:",
    darkThemeTitle = "Dark",
    lightThemeTitle = "Light",
    systemThemeTitle = "System",
    mainSettingsLanguageTitle = "App language",
    rusLanguageTitle = "Russian",
    engLanguageTitle = "English",
    gerLanguageTitle = "German",
    spaLanguageTitle = "Spanish",
    perLanguageTitle = "Persian(b)",
    freLanguageTitle = "French",
    ptLanguageTitle = "Portuguese",
    defaultLanguageTitle = "Default",
    backIconDesc = "Navigate up",
    moreIconDesc = "More",
    resetToDefaultTitle = "Reset to default",
    menuIconDesc = "Menu",
    dataSectionHeader = "Data",
    clearDataTitle = "Delete all data",
    clearDataButtonTitle = "Clear",
    clearDataWarning = "This action will lead to a complete cleaning of the application data!",
    backupDataTitle = "Backup",
    backupDataButtonTitle = "Save",
    restoreDataButtonTitle = "Restore",
    errorBackupMessage = "Backup Error",
    errorBackupFileMessage = "Error when working with the file",
    otherError = "Error! Contact the developer.",
    mainSettingsDynamicColorTitle = "Dynamic colors",
    aboutAppHeader = "About the app",
    versionCodeTitle = "Build number",
    versionNameTitle = "Version",
    developerTitle = "Developer",
    licenseTitle = "License",
    githubTitle = "Github",
    askQuestionTitle = "Ask a question",
    donateTitle = "Support the application",
    copyTitle = "Copy",
    mainSettingsColorsTitle = "Color",
    donateHeader = "Donate",
    secureSectionHeader = "Security",
    secureModeTitle = "Secure screen",
    interfaceSectionHeader = "Interface",
    calendarButtonBehaviorTitle = "Calendar button behavior",
    currentDayCalendarBehavior = "Current day",
    selectDayCalendarBehavior = "Choosing the day",
)

internal val germanSettingsString = SettingsStrings(
    settingsTitle = "Einstellungen",
    mainSettingsTitle = "Allgemeine Einstellungen",
    mainSettingsThemeTitle = "Thema:",
    darkThemeTitle = "Dunkel",
    lightThemeTitle = "Hell",
    systemThemeTitle = "System",
    mainSettingsLanguageTitle = "Sprache der Anwendung",
    rusLanguageTitle = "Russisch",
    engLanguageTitle = "Englisch",
    gerLanguageTitle = "Deutsch",
    spaLanguageTitle = "Spanisch",
    perLanguageTitle = "Persisch(b)",
    freLanguageTitle = "Französisch",
    ptLanguageTitle = "Portugiesisch",
    defaultLanguageTitle = "Standard",
    backIconDesc = "Nach oben navigieren",
    moreIconDesc = "Mehr",
    resetToDefaultTitle = "Auf Standard zurücksetzen",
    menuIconDesc = "Menü",
    dataSectionHeader = "Daten",
    clearDataTitle = "Alle Daten löschen",
    clearDataButtonTitle = "Löschen",
    clearDataWarning = "Diese Aktion führt zu einer vollständigen Bereinigung der Anwendungsdaten!",
    backupDataTitle = "Sicherung",
    backupDataButtonTitle = "Sichern",
    restoreDataButtonTitle = "Wiederherstellen",
    errorBackupMessage = "Sicherungsfehler",
    errorBackupFileMessage = "Fehler beim Arbeiten mit der Datei",
    otherError = "Fehler! Kontaktieren Sie den Entwickler.",
    mainSettingsDynamicColorTitle = "Dynamische Farben",
    aboutAppHeader = "Über die App",
    versionCodeTitle = "Build-Nummer",
    versionNameTitle = "Version",
    developerTitle = "Entwickler",
    licenseTitle = "Lizenz",
    githubTitle = "Github",
    askQuestionTitle = "eine Frage stellen",
    donateTitle = "App unterstützen",
    copyTitle = "kopieren",
    mainSettingsColorsTitle = "Farbe",
    donateHeader = "Donat",
    secureSectionHeader = "Sicherheitseinstellungen",
    secureModeTitle = "Sicherer Bildschirm",
    interfaceSectionHeader = "Schnittstelle",
    calendarButtonBehaviorTitle = "Verhalten der Kalenderschaltfläche",
    currentDayCalendarBehavior = "Aktueller Tag",
    selectDayCalendarBehavior = "Wahl des Tages",
)

internal val spanishSettingsString = SettingsStrings(
    settingsTitle = "Ajustes",
    mainSettingsTitle = "Ajustes generales",
    mainSettingsThemeTitle = "Estilo:",
    darkThemeTitle = "Oscuro",
    lightThemeTitle = "Claro",
    systemThemeTitle = "Sistema",
    mainSettingsLanguageTitle = "Idioma ",
    rusLanguageTitle = "Ruso",
    engLanguageTitle = "Inglés",
    gerLanguageTitle = "Alemán",
    spaLanguageTitle = "Español",
    perLanguageTitle = "Persa(b)",
    freLanguageTitle = "Francés",
    ptLanguageTitle = "Portugués",
    defaultLanguageTitle = "Por defecto",
    backIconDesc = "Volver arriba",
    moreIconDesc = "Más",
    resetToDefaultTitle = "Restablecer valores",
    menuIconDesc = "Menú",
    dataSectionHeader = "Datos",
    clearDataTitle = "Borrar todos los datos",
    clearDataButtonTitle = "Borrar",
    clearDataWarning = "¡Esto supondrá la eliminación completa de todos los datos!",
    backupDataTitle = "Respaldo",
    backupDataButtonTitle = "Guardar",
    restoreDataButtonTitle = "Restaurar",
    errorBackupMessage = "Error de respaldo",
    errorBackupFileMessage = "Error al trabajar con el archivo",
    otherError = "¡Error! Contacta al desarrollador.",
    mainSettingsDynamicColorTitle = "Colores dinámicos",
    aboutAppHeader = "Acerca de la aplicación",
    versionCodeTitle = "Número de construcción",
    versionNameTitle = "Versión",
    developerTitle = "Elaborador",
    licenseTitle = "Licencia",
    githubTitle = "Github",
    askQuestionTitle = "Preguntar",
    donateTitle = "Apoyar la aplicación",
    copyTitle = "Copiar",
    mainSettingsColorsTitle = "Color",
    donateHeader = "Donat",
    secureSectionHeader = "Configuración de seguridad",
    secureModeTitle = "Pantalla segura",
    interfaceSectionHeader = "Interfaz",
    calendarButtonBehaviorTitle = "Comportamiento del botón de calendario",
    currentDayCalendarBehavior = "Día actual",
    selectDayCalendarBehavior = "Selección del día",
)

internal val persianSettingsString = SettingsStrings(
    settingsTitle = "تنظبمات",
    mainSettingsTitle = "تنظیمات عمومی",
    mainSettingsThemeTitle = "پوسته",
    darkThemeTitle = "تاریک",
    lightThemeTitle = "روشن",
    systemThemeTitle = "سیستم",
    mainSettingsLanguageTitle = "زبان برنامه",
    rusLanguageTitle = "روسی",
    engLanguageTitle = "انگلیسی",
    gerLanguageTitle = "آلمانی",
    spaLanguageTitle = "اسپانیایی",
    perLanguageTitle = "فارسی (بیتا)",
    freLanguageTitle = "فرانسوی",
    ptLanguageTitle = "پرتغالی",
    defaultLanguageTitle = "پیش فرض",
    backIconDesc = "پیمایش به بالا",
    moreIconDesc = "بیشتر",
    resetToDefaultTitle = "تنظیم به حالت پیش فرض",
    menuIconDesc = "منو",
    dataSectionHeader = "داده",
    clearDataTitle = "پاک کردن تمام داده ها",
    clearDataButtonTitle = "پاک کردن",
    clearDataWarning = "این عمل منجر به پاکسازی کامل داده های برنامه می شود!",
    backupDataTitle = "پشتیبان گیری",
    backupDataButtonTitle = "ذخبره",
    restoreDataButtonTitle = "بازگردانی",
    errorBackupMessage = "خطای پشتیبان گیری",
    errorBackupFileMessage = "خطا هنگام کار با فایل",
    otherError = "خطا! با توسعه دهنده تماس بگیرید.",
    mainSettingsDynamicColorTitle = "رنگ های پویا",
    aboutAppHeader = "درباره اپلیکیشن",
    versionCodeTitle = "شماره ساخت",
    versionNameTitle = "نسخه",
    developerTitle = "توسعه دهنده",
    licenseTitle = "مجوز",
    githubTitle = "Github",
    askQuestionTitle = "سوال بپرسید",
    donateTitle = "از برنامه پشتیبانی کنید",
    copyTitle = "کپی",
    mainSettingsColorsTitle = "رنگ",
    donateHeader = "دونات",
    secureSectionHeader = "تنظیمات امنیتی",
    secureModeTitle = "صفحه نمایش امن",
    interfaceSectionHeader = "رابط کاربری",
    calendarButtonBehaviorTitle = "رفتار دکمه تقویم",
    currentDayCalendarBehavior = "روز جاری",
    selectDayCalendarBehavior = "انتخاب روز",
)

internal val frenchSettingsString = SettingsStrings(
    settingsTitle = "Paramètres",
    mainSettingsTitle = "Paramètres généraux",
    mainSettingsThemeTitle = "Theme:",
    darkThemeTitle = "Sombre",
    lightThemeTitle = "Clair",
    systemThemeTitle = "Système",
    mainSettingsLanguageTitle = "Langue de l'application",
    rusLanguageTitle = "Russe",
    engLanguageTitle = "Anglais",
    gerLanguageTitle = "Allemand",
    spaLanguageTitle = "Espagnol",
    perLanguageTitle = "Perse(b)",
    freLanguageTitle = "Français",
    ptLanguageTitle = "Portugais",
    defaultLanguageTitle = "Défaut",
    backIconDesc = "Naviguer vers le haut",
    moreIconDesc = "Plus",
    resetToDefaultTitle = "Reinitialiser",
    menuIconDesc = "Menu",
    dataSectionHeader = "Données",
    clearDataTitle = "Supprimer toutes les données",
    clearDataButtonTitle = "Supprimer",
    clearDataWarning = "Cette action entrainera une suppression de toutes les données de l'application!",
    backupDataTitle = "Sauvegarde",
    backupDataButtonTitle = "Sauvegarder",
    restoreDataButtonTitle = "Restaurer",
    errorBackupMessage = "Erreur de sauvegarde",
    errorBackupFileMessage = "Erreur pendant la manipulation du fichier",
    otherError = "Erreur! Contactez le developpeur.",
    mainSettingsDynamicColorTitle = "Couleurs dynamiques",
    aboutAppHeader = "À propos de l'application",
    versionCodeTitle = "Numéro d'assemblage",
    versionNameTitle = "Version",
    developerTitle = "Développeur",
    licenseTitle = "Licence",
    githubTitle = "Github",
    askQuestionTitle = "Poser une question",
    donateTitle = "Soutenir l'application",
    copyTitle = "Copier",
    mainSettingsColorsTitle = "Couleur",
    donateHeader = "Donat",
    secureSectionHeader = "Paramètres de sécurité",
    secureModeTitle = "Écran sécurisé",
    interfaceSectionHeader = "Interface",
    calendarButtonBehaviorTitle = "Comportement du bouton calendrier",
    currentDayCalendarBehavior = "Jour en cours",
    selectDayCalendarBehavior = "Choix du jour",
)

internal val brazilianPortugueseSettingsString = SettingsStrings(
    settingsTitle = "Configurações",
    mainSettingsTitle = "Configurações gerais",
    mainSettingsThemeTitle = "Tema:",
    darkThemeTitle = "Escuro",
    lightThemeTitle = "Claro",
    systemThemeTitle = "Sistema",
    mainSettingsLanguageTitle = "Idioma do aplicativo",
    rusLanguageTitle = "Russo",
    engLanguageTitle = "Inglês",
    gerLanguageTitle = "Alemão",
    spaLanguageTitle = "Espanhol",
    perLanguageTitle = "Persa(b)",
    freLanguageTitle = "Francês",
    ptLanguageTitle = "Português",
    defaultLanguageTitle = "Padrão",
    backIconDesc = "Navegar para cima",
    moreIconDesc = "Mais",
    resetToDefaultTitle = "Resetar para padrão",
    menuIconDesc = "Menu",
    dataSectionHeader = "Dado",
    clearDataTitle = "Apagar todos os dados",
    clearDataButtonTitle = "Limpar",
    clearDataWarning = "Esta ação irá limpar todos os dados da aplicação!",
    backupDataTitle = "Backup",
    backupDataButtonTitle = "Salvar",
    restoreDataButtonTitle = "Restaurar",
    errorBackupMessage = "Erro de backup",
    errorBackupFileMessage = "Erro durante o uso do arquivo",
    otherError = "Erro! Contate o desenvolvedor.",
    mainSettingsDynamicColorTitle = "Cores dinâmicas",
    aboutAppHeader = "Sobre o aplicativo",
    versionCodeTitle = "Número de construção",
    versionNameTitle = "Versão",
    developerTitle = "Desenvolvedor",
    licenseTitle = "Licença",
    githubTitle = "Github",
    askQuestionTitle = "Faça uma pergunta",
    donateTitle = "Suportar a aplicação",
    copyTitle = "Copiar",
    mainSettingsColorsTitle = "Cor",
    donateHeader = "Doar",
    secureSectionHeader = "Segurança",
    secureModeTitle = "Modo seguro",
    interfaceSectionHeader = "Interface",
    calendarButtonBehaviorTitle = "Comportamento do botão do calendário",
    currentDayCalendarBehavior = "Dia atual",
    selectDayCalendarBehavior = "Escolhendo o dia",
)

internal val LocalSettingsStrings = staticCompositionLocalOf<SettingsStrings> {
    error("Settings Strings is not provided")
}

internal fun fetchSettingsStrings(language: TimePlannerLanguage) = when (language) {
    TimePlannerLanguage.EN -> englishSettingsString
    TimePlannerLanguage.RU -> russianSettingsString
    TimePlannerLanguage.DE -> germanSettingsString
    TimePlannerLanguage.ES -> spanishSettingsString
    TimePlannerLanguage.FA -> persianSettingsString
    TimePlannerLanguage.FR -> frenchSettingsString
    TimePlannerLanguage.PT -> brazilianPortugueseSettingsString
}
