package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hql implements hqg {
    private final /* synthetic */ int a;
    private final Object b;

    public hql(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new hpv((Context) this.b, 5, (char[]) null) : new hpv((Context) this.b, 4, (byte[]) null) : new hqt((hfw) this.b) : new hpq(this.b, hqj.a, 2) : new hpq(this.b, hqkVar.a(Uri.class, InputStream.class), 2) : new hpv(this.b, 2) : new hpq(this.b, hqkVar.a(Uri.class, AssetFileDescriptor.class), 2);
    }

    public hql(int i) {
        this.a = i;
        this.b = new hfw(500L);
    }
}
