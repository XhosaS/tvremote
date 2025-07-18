package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
class daa implements dag {
    final /* synthetic */ InputStream a;
    final /* synthetic */ ddx b;

    public daa(InputStream inputStream, ddx ddxVar) {
        this.a = inputStream;
        this.b = ddxVar;
    }

    @Override // defpackage.dag
    public final int a(czv czvVar) throws IOException {
        try {
            return czvVar.a(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
