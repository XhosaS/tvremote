package defpackage;

import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lvq extends mjo {
    public lvq() {
        super((char[]) null);
    }

    @Override // defpackage.mjo
    public final void b(mer merVar, Attributes attributes) {
        lvw.c = ksh.b(lvw.e(attributes, "region").substring(1), 0);
    }
}
