package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czk implements czl {
    private final Uri a;
    private final ClipDescription b;
    private final Uri c;

    public czk(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.czl
    public final ClipDescription a() {
        return this.b;
    }

    @Override // defpackage.czl
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.czl
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.czl
    public final Object d() {
        return null;
    }

    @Override // defpackage.czl
    public final void e() {
    }
}
