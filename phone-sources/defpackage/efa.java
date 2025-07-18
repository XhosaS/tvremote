package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efa implements ees {
    private final Context a;
    private final List b = new ArrayList();
    private final ees c;
    private ees d;
    private ees e;
    private ees f;
    private ees g;
    private ees h;
    private ees i;
    private ees j;
    private ees k;

    public efa(Context context, ees eesVar) {
        this.a = context.getApplicationContext();
        this.c = eesVar;
    }

    private final ees g() {
        if (this.e == null) {
            eel eelVar = new eel(this.a);
            this.e = eelVar;
            h(eelVar);
        }
        return this.e;
    }

    private final void h(ees eesVar) {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return;
            }
            eesVar.f((efy) list.get(i));
            i++;
        }
    }

    private static final void i(ees eesVar, efy efyVar) {
        if (eesVar != null) {
            eesVar.f(efyVar);
        }
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) {
        ees eesVar = this.k;
        eesVar.getClass();
        return eesVar.a(bArr, i, i2);
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) {
        ees eesVar;
        a.ab(this.k == null);
        Uri uri = eeyVar.a;
        String scheme = uri.getScheme();
        String str = edt.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    efh efhVar = new efh();
                    this.d = efhVar;
                    h(efhVar);
                }
                this.k = this.d;
            } else {
                this.k = g();
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                eeo eeoVar = new eeo(this.a);
                this.f = eeoVar;
                h(eeoVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    ees eesVar2 = (ees) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = eesVar2;
                    h(eesVar2);
                } catch (ClassNotFoundException unused) {
                    edb.e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                ega egaVar = new ega();
                this.h = egaVar;
                h(egaVar);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                eep eepVar = new eep();
                this.i = eepVar;
                h(eepVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    efs efsVar = new efs(this.a);
                    this.j = efsVar;
                    h(efsVar);
                }
                eesVar = this.j;
            } else {
                eesVar = this.c;
            }
            this.k = eesVar;
        }
        return this.k.b(eeyVar);
    }

    @Override // defpackage.ees
    public final Uri c() {
        ees eesVar = this.k;
        if (eesVar == null) {
            return null;
        }
        return eesVar.c();
    }

    @Override // defpackage.ees
    public final void d() {
        ees eesVar = this.k;
        if (eesVar != null) {
            try {
                eesVar.d();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.ees
    public final Map e() {
        ees eesVar = this.k;
        return eesVar == null ? Collections.EMPTY_MAP : eesVar.e();
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        this.c.f(efyVar);
        this.b.add(efyVar);
        i(this.d, efyVar);
        i(this.e, efyVar);
        i(this.f, efyVar);
        i(this.g, efyVar);
        i(this.h, efyVar);
        i(this.i, efyVar);
        i(this.j, efyVar);
    }
}
