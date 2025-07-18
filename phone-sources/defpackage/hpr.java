package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpr implements hqg {
    private final /* synthetic */ int a;
    private final Object b;

    public hpr(int i, byte[] bArr) {
        this.a = i;
        this.b = new hjt();
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        int i = this.a;
        if (i == 0) {
            return new hpv(this.b, 0);
        }
        if (i == 1) {
            return new hqj(1);
        }
        if (i != 2) {
            return new hpq((Context) this.b, hqkVar.a(Integer.class, InputStream.class), 3);
        }
        return new hpq((Context) this.b, hqkVar.a(Integer.class, AssetFileDescriptor.class), 3);
    }

    public hpr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
