# Cloud Android Build Demo (Harmless Test)

This is **not** a Guardian application and does not interact with any existing app or personal data.

- Package ID: `com.example.cloudbuilddemo` (unique)
- No permissions requested (no contacts, microphone, files, or network)
- Debug APK built in GitHub Actions; signed automatically with a throwaway **debug key**, not any production signing key
- Requires no Dell and no USB to build
- Public demo code only; do not put patient data, secrets, signing keys, or actual Guardian code here

## From a Samsung phone

1. Open the GitHub repository → Actions → **Build Android Cloud Demo** → most recent successful run.
2. Download the `Android-Cloud-Demo-APK` artifact; GitHub provides a ZIP file.
3. In Samsung **My Files**, extract the ZIP and tap `app-debug.apk` to install.
4. If Android asks, allow installs from **My Files** for this one installation, then turn that permission off afterward.
5. Launch **Cloud Build Demo**; it should display **CLOUD BUILD WORKING**.

Only do this after the GitHub Actions run shows success and you've checked the artifact belongs to this test branch.

The real Guardian apps require their own source transfer, signing, privacy review, backups, rollback plans and separate installation approval.
