package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sy implements ta {
    final InputContentInfo a;

    public sy(Object obj) {
        this.a = fn$$ExternalSyntheticApiModelOutline0.m(obj);
    }

    @Override // defpackage.ta
    public final ClipDescription a() {
        return this.a.getDescription();
    }

    @Override // defpackage.ta
    public final Uri b() {
        return this.a.getContentUri();
    }

    @Override // defpackage.ta
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.ta
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.ta
    public final void e() {
        this.a.requestPermission();
    }

    public sy(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
