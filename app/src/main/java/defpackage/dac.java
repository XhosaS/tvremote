package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dac implements daf {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ ddx b;

    public dac(ByteBuffer byteBuffer, ddx ddxVar) {
        this.a = byteBuffer;
        this.b = ddxVar;
    }

    @Override // defpackage.daf
    public final boolean a(czv czvVar) {
        try {
            return czvVar.f(this.a, this.b);
        } finally {
            dpw.b(this.a);
        }
    }
}
