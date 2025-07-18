package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgr implements eac {
    public final List a;

    public fgr(List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((fgq) list.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((fgq) list.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((fgq) list.get(i)).b;
                    i++;
                }
            }
        }
        a.H(!z);
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fgr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
