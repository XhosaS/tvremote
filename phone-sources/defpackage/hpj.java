package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpj implements hqg {
    private final /* synthetic */ int a;

    public hpj(int i) {
        this.a = i;
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        int i = this.a;
        if (i == 0) {
            return new hpv(new hpi(0), 1);
        }
        if (i == 1) {
            return new hpv(new hpi(1), 1);
        }
        if (i == 2) {
            return new hpl();
        }
        if (i == 3) {
            return new hpv(hqkVar.a(Uri.class, AssetFileDescriptor.class), 3);
        }
        if (i == 4) {
            return new hpv(hqkVar.a(Uri.class, ParcelFileDescriptor.class), 3);
        }
        if (i == 5) {
            return new hpv(hqkVar.a(Uri.class, InputStream.class), 3);
        }
        hqf hqfVarA = hqkVar.a(hpw.class, InputStream.class);
        hqfVarA.getClass();
        return new jwp(hqfVarA);
    }
}
