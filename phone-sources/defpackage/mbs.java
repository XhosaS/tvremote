package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbs implements idy {
    public final idy a;
    public final String b;
    public final String c;
    private final mfk d;
    private final Set e = new HashSet();
    private final Set f = new HashSet();

    public mbs(idy idyVar, mfk mfkVar, String str, String str2) {
        this.a = idyVar;
        this.d = mfkVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.idy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized void c(ksn ksnVar) {
        if (this.e.add(ksnVar)) {
            this.d.g(ksnVar, new mbr(this, ksnVar, 0));
        } else {
            this.f.add(ksnVar);
        }
    }

    public final synchronized void b(ksn ksnVar) {
        Set set = this.e;
        set.remove(ksnVar);
        if (this.f.remove(ksnVar)) {
            set.add(ksnVar);
            this.d.g(ksnVar, new mbr(this, ksnVar, 0));
        }
    }
}
