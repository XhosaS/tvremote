package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwu implements hyo {
    final /* synthetic */ hxr a;

    public hwu(hxr hxrVar) {
        this.a = hxrVar;
    }

    @Override // defpackage.hyo
    public final void a() {
        hxr hxrVar = this.a;
        if (hxrVar.l.isTouchExplorationEnabled()) {
            ((zdv) hxr.f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$contentSetup$1", "onHesitationDetected", 1085, "VoicePlateActivity.kt")).u("Skipping onSpeechHesitationDetected signal for a11y");
        } else {
            hxrVar.H().i();
        }
    }

    @Override // defpackage.hyo
    public final void b() {
        zdy zdyVar = hxr.f;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$contentSetup$1", "onPreparationTimeout", 1092, "VoicePlateActivity.kt")).u("IHesitationDetectedListener#onPreparationTimeout");
        hxr hxrVar = this.a;
        hxrVar.P();
        if (hxrVar.l.isTouchExplorationEnabled()) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$contentSetup$1", "onPreparationTimeout", 1096, "VoicePlateActivity.kt")).u("Skipping onSpeechHesitationDetected signal for a11y");
        } else {
            hxrVar.H().i();
        }
    }
}
