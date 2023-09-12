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
    val mainSettingsClearDataTitle: String,
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
)

internal val russianSettingsString = SettingsStrings(
    settingsTitle = "Настройки",
    mainSettingsTitle = "Основные настройки",
    mainSettingsThemeTitle = "Тема:",
    darkThemeTitle = "Тёмная",
    lightThemeTitle = "Светлая",
    systemThemeTitle = "Системная",
    rusLanguageTitle = "Русский",
    engLanguageTitle = "Английский",
    gerLanguageTitle = "Немецкий",
    spaLanguageTitle = "Испанский",
    perLanguageTitle = "Персидский(b)",
    freLanguageTitle = "French", // Please translate :)
    defaultLanguageTitle = "По умолчанию",
    mainSettingsLanguageTitle = "Язык приложения",
    backIconDesc = "Назад",
    moreIconDesc = "Дополнительно",
    resetToDefaultTitle = "По умолчанию",
    menuIconDesc = "Меню",
    clearDataTitle = "Удалить все данные",
    mainSettingsClearDataTitle = "Данные",
    clearDataButtonTitle = "Очистить",
    clearDataWarning = "Данное действие приведёт к полной очистке данных приложения!",
    backupDataTitle = "Резервная копия",
    backupDataButtonTitle = "Сохранить",
    restoreDataButtonTitle = "Восстановить",
    errorBackupMessage = "Ошибка резервного копирования",
    errorBackupFileMessage = "Ошибка при работе с файлом",
    otherError = "Ошибка! Обратитесь к разработчику.",
    mainSettingsDynamicColorTitle = "Динамические цвета",
)

internal val englishSettingsString = SettingsStrings(
    settingsTitle = "Settings",
    mainSettingsTitle = "General settings",
    mainSettingsThemeTitle = "Theme:",
    darkThemeTitle = "Dark",
    lightThemeTitle = "Light",
    systemThemeTitle = "System",
    rusLanguageTitle = "Russian",
    engLanguageTitle = "English",
    gerLanguageTitle = "German",
    spaLanguageTitle = "Spanish",
    perLanguageTitle = "Persian(b)",
    freLanguageTitle = "French",
    defaultLanguageTitle = "Default",
    mainSettingsLanguageTitle = "App language",
    backIconDesc = "Navigate up",
    moreIconDesc = "More",
    resetToDefaultTitle = "Reset to default",
    menuIconDesc = "Menu",
    clearDataTitle = "Delete all data",
    mainSettingsClearDataTitle = "Data",
    clearDataButtonTitle = "Clear",
    clearDataWarning = "This action will lead to a complete cleaning of the application data!",
    backupDataTitle = "Backup",
    backupDataButtonTitle = "Save",
    restoreDataButtonTitle = "Restore",
    errorBackupMessage = "Backup Error",
    errorBackupFileMessage = "Error when working with the file",
    otherError = "Error! Contact the developer.",
    mainSettingsDynamicColorTitle = "Dynamic colors",
)

internal val germanSettingsString = SettingsStrings(
    settingsTitle = "Einstellungen",
    mainSettingsTitle = "Allgemeine Einstellungen",
    mainSettingsThemeTitle = "Thema:",
    darkThemeTitle = "Dunkel",
    lightThemeTitle = "Hell",
    systemThemeTitle = "System",
    rusLanguageTitle = "Russisch",
    engLanguageTitle = "Englisch",
    gerLanguageTitle = "Deutsch",
    spaLanguageTitle = "Spanisch",
    perLanguageTitle = "Persisch(b)",
    freLanguageTitle = "Französisch",
    defaultLanguageTitle = "Standard",
    mainSettingsLanguageTitle = "Sprache der Anwendung",
    backIconDesc = "Nach oben navigieren",
    moreIconDesc = "Mehr",
    resetToDefaultTitle = "Auf Standard zurücksetzen",
    menuIconDesc = "Menü",
    clearDataTitle = "Alle Daten löschen",
    mainSettingsClearDataTitle = "Daten",
    clearDataButtonTitle = "Löschen",
    clearDataWarning = "Diese Aktion führt zu einer vollständigen Bereinigung der Anwendungsdaten!",
    backupDataTitle = "Sicherung",
    backupDataButtonTitle = "Sichern",
    restoreDataButtonTitle = "Wiederherstellen",
    errorBackupMessage = "Sicherungsfehler",
    errorBackupFileMessage = "Fehler beim Arbeiten mit der Datei",
    otherError = "Fehler! Kontaktieren Sie den Entwickler.",
    mainSettingsDynamicColorTitle = "Dynamische Farben",
)

internal val spanishSettingsString = SettingsStrings(
    settingsTitle = "Ajustes",
    mainSettingsTitle = "Ajustes generales",
    mainSettingsThemeTitle = "Estilo:",
    darkThemeTitle = "Oscuro",
    lightThemeTitle = "Claro",
    systemThemeTitle = "Sistema",
    rusLanguageTitle = "Ruso",
    engLanguageTitle = "Inglés",
    gerLanguageTitle = "Alemán",
    spaLanguageTitle = "Español",
    perLanguageTitle = "Persa(b)",
    freLanguageTitle = "Francés",
    defaultLanguageTitle = "Por defecto",
    mainSettingsLanguageTitle = "Idioma ",
    backIconDesc = "Volver arriba",
    moreIconDesc = "Más",
    resetToDefaultTitle = "Restablecer valores",
    menuIconDesc = "Menú",
    clearDataTitle = "Borrar todos los datos",
    mainSettingsClearDataTitle = "Datos",
    clearDataButtonTitle = "Borrar",
    clearDataWarning = "¡Esto supondrá la eliminación completa de todos los datos!",
    backupDataTitle = "Respaldo",
    backupDataButtonTitle = "Guardar",
    restoreDataButtonTitle = "Restaurar",
    errorBackupMessage = "Error de respaldo",
    errorBackupFileMessage = "Error al trabajar con el archivo",
    otherError = "¡Error! Contacta al desarrollador.",
    mainSettingsDynamicColorTitle = "Colores dinámicos",
)

internal val persianSettingsString = SettingsStrings(
    settingsTitle = "تنظبمات",
    mainSettingsTitle = "تنظیمات عمومی",
    mainSettingsThemeTitle = "پوسته",
    darkThemeTitle = "تاریک",
    lightThemeTitle = "روشن",
    systemThemeTitle = "سیستم",
    rusLanguageTitle = "روسی",
    engLanguageTitle = "انگلیسی",
    spaLanguageTitle = "اسپانیایی",
    perLanguageTitle = "فارسی (بیتا)",
    gerLanguageTitle = "آلمانی",
    freLanguageTitle = "French", // Please translate :)
    defaultLanguageTitle = "پیش فرض",
    mainSettingsLanguageTitle = "زبان برنامه",
    backIconDesc = "پیمایش به بالا",
    moreIconDesc = "بیشتر",
    resetToDefaultTitle = "تنظیم به حالت پیش فرض",
    menuIconDesc = "منو",
    clearDataTitle = "پاک کردن تمام داده ها",
    mainSettingsClearDataTitle = "داده",
    clearDataButtonTitle = "پاک کردن",
    clearDataWarning = "این عمل منجر به پاکسازی کامل داده های برنامه می شود!",
    backupDataTitle = "پشتیبان گیری",
    backupDataButtonTitle = "ذخبره",
    restoreDataButtonTitle = "بازگردانی",
    errorBackupMessage = "خطای پشتیبان گیری",
    errorBackupFileMessage = "خطا هنگام کار با فایل",
    otherError = "خطا! با توسعه دهنده تماس بگیرید.",
    mainSettingsDynamicColorTitle = "رنگ های پویا",
)

internal val frenchSettingsString = SettingsStrings(
    settingsTitle = "Paramètres",
    mainSettingsTitle = "Paramètres généraux",
    mainSettingsThemeTitle = "Theme:",
    darkThemeTitle = "Sombre",
    lightThemeTitle = "Clair",
    systemThemeTitle = "Système",
    rusLanguageTitle = "Russe",
    engLanguageTitle = "Anglais",
    gerLanguageTitle = "Allemand",
    spaLanguageTitle = "Espagnol",
    perLanguageTitle = "Perse(b)",
    freLanguageTitle = "Français",
    defaultLanguageTitle = "Défaut",
    mainSettingsLanguageTitle = "Langue de l'application",
    backIconDesc = "Naviguer vers le haut",
    moreIconDesc = "Plus",
    resetToDefaultTitle = "Reinitialiser",
    menuIconDesc = "Menu",
    clearDataTitle = "Supprimer toutes les données",
    mainSettingsClearDataTitle = "Données",
    clearDataButtonTitle = "Supprimer",
    clearDataWarning = "Cette action entrainera une suppression de toutes les données de l'application!",
    backupDataTitle = "Sauvegarde",
    backupDataButtonTitle = "Sauvegarder",
    restoreDataButtonTitle = "Restaurer",
    errorBackupMessage = "Erreur de sauvegarde",
    errorBackupFileMessage = "Erreur pendant la manipulation du fichier",
    otherError = "Erreur! Contactez le developpeur.",
    mainSettingsDynamicColorTitle = "Couleurs dynamiques",
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
}
