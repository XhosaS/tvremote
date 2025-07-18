package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czj implements czl {
    final InputContentInfo a;

    public czj(Object obj) {
        this.a = csd$$ExternalSyntheticApiModelOutline0.m325m(obj);
    }

    @Override // defpackage.czl
    public final ClipDescription a() {
        return this.a.getDescription();
    }

    @Override // defpackage.czl
    public final Uri b() {
        return this.a.getContentUri();
    }

    @Override // defpackage.czl
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.czl
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.czl
    public final void e() {
        this.a.requestPermission();
    }

    public czj(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
