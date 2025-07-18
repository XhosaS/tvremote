package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dad implements daf {
    final /* synthetic */ InputStream a;
    final /* synthetic */ ddx b;

    public dad(InputStream inputStream, ddx ddxVar) {
        this.a = inputStream;
        this.b = ddxVar;
    }

    @Override // defpackage.daf
    public final boolean a(czv czvVar) throws IOException {
        try {
            return czvVar.e(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
