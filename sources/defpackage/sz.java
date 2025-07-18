package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sz implements ta {
    private final Uri a;
    private final ClipDescription b;
    private final Uri c;

    public sz(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.ta
    public final ClipDescription a() {
        return this.b;
    }

    @Override // defpackage.ta
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.ta
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.ta
    public final Object d() {
        return null;
    }

    @Override // defpackage.ta
    public final void e() {
    }
}
