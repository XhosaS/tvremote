package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pi implements pj {
    private final ContentInfo a;

    public pi(ContentInfo contentInfo) {
        qk.s(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.pj
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.pj
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.pj
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.pj
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
