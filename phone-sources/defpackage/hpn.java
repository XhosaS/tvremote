package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpn implements hqg, hpp {
    private final Context a;
    private final /* synthetic */ int b;

    public hpn(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.hpp
    public final Class a() {
        int i = this.b;
        return i != 0 ? i != 1 ? InputStream.class : AssetFileDescriptor.class : Drawable.class;
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new hpq(this.a, (hpp) this, 0) : new hpq(this.a, (hpp) this, 0) : new hpq(this.a, (hpp) this, 0);
    }

    @Override // defpackage.hpp
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            return i2 != 1 ? resources.openRawResource(i) : resources.openRawResourceFd(i);
        }
        Context context = this.a;
        return hta.a(context, context, i, theme);
    }

    @Override // defpackage.hpp
    public final /* synthetic */ void d(Object obj) throws IOException {
        int i = this.b;
        if (i == 0) {
        } else if (i != 1) {
            ((InputStream) obj).close();
        } else {
            ((AssetFileDescriptor) obj).close();
        }
    }
}
