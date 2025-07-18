package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afs implements aft {
    private final ContentInfo a;

    public afs(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override // defpackage.aft
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.aft
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.aft
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.aft
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
