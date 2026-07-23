# RHL Directory

Mental health provider referral directory. Collects, organizes, and shares therapist/psychologist data.

## What it does
- Browse, search, and filter mental health providers
- Share any provider's info via WhatsApp or any app
- Export your full provider list to email or download as CSV/JSON
- Add providers 5 ways: manual, Excel, text paste, voice, photo/PDF
- AI extracts provider info from text, voice notes, and flyers (needs API key)
- Triage queue: review AI-extracted data before approving
- Works offline, installable on Android as an app

## Data fields (12)
Name, Title, Specialty, Phone, Email, Location, Insurance, Languages, Gender, Availability, Website, Notes

## How to use
1. Open the live link in Chrome
2. On Android: tap menu (three dots) > "Add to Home Screen" to install as app
3. Go to Settings tab to enter Claude API key for AI features
4. Go to Settings tab to set export email address

## User requirements
- Share provider info via WhatsApp or native share
- Export all data to a specific email address with one tap
- Show indicator when data was last exported
- Full-screen modal for add/edit (Android keyboard fix)
- 5 input methods: manual, Excel, text paste, voice, image/PDF drop zone
- Triage queue for AI-extracted data
- Works on phone and computer
- Download data as JSON or CSV for backup

## Tech
- Single HTML file, no build tools needed
- PWA (Progressive Web App) — installable from browser
- localStorage for data (works offline, no signup)
- SheetJS for Excel import
- Web Speech API for voice
- Claude API for AI extraction (user provides key)
