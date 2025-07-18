package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uia extends ujl {
    public MessageLite a;
    public yqt b;
    public umz c;
    private Uri d;
    private yyf e;
    private yyk f;
    private boolean g;
    private byte h;

    public uia() {
        this.b = ypv.a;
    }

    @Override // defpackage.ujl
    public final ujm a() {
        Uri uri;
        MessageLite messageLite;
        umz umzVar;
        yyf yyfVar = this.e;
        if (yyfVar != null) {
            this.f = yyfVar.f();
        } else if (this.f == null) {
            int i = yyk.e;
            this.f = zcg.b;
        }
        if (this.h == 3 && (uri = this.d) != null && (messageLite = this.a) != null && (umzVar = this.c) != null) {
            return new uib(uri, messageLite, this.b, this.f, umzVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.a == null) {
            sb.append(" schema");
        }
        if (this.c == null) {
            sb.append(" variantConfig");
        }
        if ((this.h & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ujl
    public final yyf b() {
        if (this.e == null) {
            if (this.f == null) {
                int i = yyk.e;
                this.e = new yyf(4);
            } else {
                int i2 = yyk.e;
                yyf yyfVar = new yyf(4);
                this.e = yyfVar;
                yyfVar.h(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.ujl
    public final void c() {
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.ujl
    public final void d(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null schema");
        }
        this.a = messageLite;
    }

    @Override // defpackage.ujl
    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }

    @Override // defpackage.ujl
    public final void f(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 1);
    }

    public uia(ujm ujmVar) {
        this.b = ypv.a;
        uib uibVar = (uib) ujmVar;
        this.d = uibVar.a;
        this.a = uibVar.b;
        this.b = uibVar.c;
        this.f = uibVar.d;
        this.c = uibVar.e;
        this.g = uibVar.f;
        this.h = (byte) 3;
    }
}
