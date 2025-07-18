package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czz implements dag {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ ddx b;

    public czz(ByteBuffer byteBuffer, ddx ddxVar) {
        this.a = byteBuffer;
        this.b = ddxVar;
    }

    @Override // defpackage.dag
    public final int a(czv czvVar) {
        try {
            return czvVar.b(this.a, this.b);
        } finally {
            dpw.b(this.a);
        }
    }
}
