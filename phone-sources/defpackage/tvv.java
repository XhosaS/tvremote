package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvv {
    public final Object a;
    public final /* synthetic */ Object b;

    public tvv() {
        throw null;
    }

    public tvv(ryz ryzVar, rza rzaVar) {
        this.b = ryzVar;
        this.a = rzaVar;
    }

    public tvv(Set set) {
        this.b = set;
        this.a = twk.a(set);
    }

    public tvv(tlm tlmVar) {
        this.b = tlmVar;
        this.a = new ByteArrayOutputStream();
    }
}
