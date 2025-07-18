package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cuv implements cuw {
    private final ContentInfo a;

    public cuv(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override // defpackage.cuw
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.cuw
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.cuw
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.cuw
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
