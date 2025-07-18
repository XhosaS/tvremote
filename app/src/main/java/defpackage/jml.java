package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jml implements ich {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/params/ThirdPartyCapabilitiesUpdater");
    public final fae b;
    public final Set c;
    private final ahbt d;
    private final gtu e;

    public jml(ahbt ahbtVar, fae faeVar, gtu gtuVar, ick ickVar) {
        ahbtVar.getClass();
        gtuVar.getClass();
        ickVar.getClass();
        this.d = ahbtVar;
        this.b = faeVar;
        this.e = gtuVar;
        Set setF = Sets.f();
        setF.getClass();
        this.c = setF;
        gtuVar.q(new jmj(this));
        ickVar.d(this, icg.p, icg.n, icg.o);
    }

    public final void a(jlq jlqVar) {
        this.c.add(jlqVar);
    }

    @Override // defpackage.ich
    public final void b(icg icgVar) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/params/ThirdPartyCapabilitiesUpdater", "onSettingChanged", 55, "ThirdPartyCapabilitiesUpdater.kt")).x("onSettingChanged: %s", icgVar);
        c();
    }

    public final void c() {
        ahal.e(this.d, null, 0, new jmk(this, null), 3);
    }
}
