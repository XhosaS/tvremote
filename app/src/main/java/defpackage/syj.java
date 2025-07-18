package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syj implements syb {
    public final ryr a;
    public final long b;
    public abvo c = abvo.b;
    public final agzv d = new agzv(false, agzz.a);
    final /* synthetic */ syl e;

    public syj(syl sylVar, ryr ryrVar, long j) {
        this.e = sylVar;
        this.a = ryrVar;
        this.b = j;
    }

    @Override // defpackage.sya
    public final zyd a() {
        if (this.d.b()) {
            return zxn.f();
        }
        syl sylVar = this.e;
        return sylVar.e.a(new syh(this, sylVar, null));
    }

    @Override // defpackage.sya
    public final /* synthetic */ zyd b(rsu rsuVar) {
        return sxz.a(this, rsuVar);
    }

    @Override // defpackage.sya
    public final zyd c(abvo abvoVar) {
        if (d()) {
            return zxn.f();
        }
        syl sylVar = this.e;
        return sylVar.e.a(new syi(this, abvoVar, null));
    }

    public final boolean d() {
        if (!this.d.b()) {
            return false;
        }
        ((zdv) ((zdv) syl.a.d().o(zfi.a, "ALT.SingleRecordStore")).n(1, TimeUnit.SECONDS).q("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore$Writer", "maybeSkipWriteIfClosed", 79, "SingleAudioRecordStore.kt")).w("#audio# write called after close, skipping... AudioRecordId: %d", this.b);
        return true;
    }
}
