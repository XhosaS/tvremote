package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class kgt implements kit {
    public final keg a;
    public final kfq b;
    final /* synthetic */ kgu e;
    public kjw f = null;
    public Set c = null;
    public boolean d = false;

    public kgt(kgu kguVar, keg kegVar, kfq kfqVar) {
        this.e = kguVar;
        this.a = kegVar;
        this.b = kfqVar;
    }

    @Override // defpackage.kit
    public final void a(ConnectionResult connectionResult) {
        this.e.o.post(new kgs(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        kgq kgqVar = (kgq) this.e.l.get(this.b);
        if (kgqVar != null) {
            kgqVar.l(connectionResult);
        }
    }

    public final void c() {
        kjw kjwVar;
        if (!this.d || (kjwVar = this.f) == null) {
            return;
        }
        this.a.s(kjwVar, this.c);
    }
}
