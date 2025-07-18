package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvf extends xvx {
    final /* synthetic */ xvi a;
    final /* synthetic */ xzg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvf(xvi xviVar, xzg xzgVar) {
        super(xviVar.b.f);
        this.b = xzgVar;
        this.a = xviVar;
    }

    @Override // defpackage.xvx
    public final void a() throws IOException {
        int i = yfl.a;
        xvi xviVar = this.a;
        xvj xvjVar = xviVar.b;
        if (xviVar.a != null) {
            xxc.j(this.b);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamA = this.b.a();
                if (inputStreamA == null) {
                    return;
                }
                try {
                    xviVar.c.d(xvjVar.c.e.b(inputStreamA));
                    inputStreamA.close();
                } catch (Throwable th) {
                    xxc.g(inputStreamA);
                    throw th;
                }
            } catch (Throwable th2) {
                xxc.j(this.b);
                this.a.b(xtk.c.d(th2).e("Failed to read message."));
                return;
            }
        }
    }
}
