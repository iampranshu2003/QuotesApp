# 📚 QuotesApp

## Overview
QuotesApp is a simple Android application that displays a collection of inspirational quotes.  
The app shows quotes along with their authors in a clean, scrollable list.

---

## ✨ Features
- Clean, modern interface using Material Design
- Scrollable list of quotes
- Each quote displays the quote text and author
- Quotes are loaded from a local JSON file

---

## 🏛 App Structure

### 📂 Data
- **Quote Model**: Stores quote text and author
- **DataManager**: Loads quotes from a JSON file and manages app data
- **quotes.json**: Contains all quotes in JSON format

### 🖥 Screens
- **QuoteScreen**: Main screen showing the app title and list of quotes
- **QuoteList**: Scrollable list component for displaying quotes
- **QuoteListItem**: Individual card displaying a single quote and author

---

## 🛠 Main Components
- **MainActivity.kt**: Application entry point
- **App Composable**: Main app container that shows the quote screen when data is loaded

---

## 🚀 How to Use
1. **Start the App**: Launch the app and it will automatically load the quotes.
2. **Browse Quotes**: Scroll through the list to view different quotes.
3. **Tap on Quotes**: (Optional) Tap functionality can be customized further.

---

## 🛠 How to Modify

### ➕ Adding New Quotes
- Add new quotes to the `assets/quotes.json` file in this format:
```json
{
  "quotes": [
    {
      "text": "Your new quote here.",
      "author": "Author Name"
    }
  ]
}
```

### 🎨 Changing the Design
- Modify `QuoteListItem.kt` to change how individual quotes appear.
- Edit `QuoteScreen.kt` to change the overall layout.
- Update colors in the `theme` files.

### 🚀 Adding Features
- The app uses **Jetpack Compose** - Google's modern toolkit for building native UI.
- The codebase follows a **clean separation** between data and UI.

---

## 🗂 File Structure
```
├── MainActivity.kt          # App entry point
├── DataManager.kt           # Loads and manages quotes data
├── model/
│   └── Quote.kt             # Data class for quotes
├── screens/
│   ├── QuoteScreen.kt       # Main quote screen
│   ├── QuoteList.kt         # List display for quotes
│   └── QuoteListItem.kt     # Individual quote display
├── assets/
│   └── quotes.json          # Source quotes data
```

---

## 🔄 Code Flow
1. App starts in `MainActivity`
2. `DataManager` loads quotes from the `quotes.json`
3. When loading completes, `QuoteScreen` is displayed
4. `QuoteScreen` shows quotes using `QuoteList`
5. `QuoteList` creates a `QuoteListItem` for each quote

---

## 📈 Future Improvements
This app provides a simple foundation that can be expanded with more features like:
- Favorite quotes
- Sharing quotes
