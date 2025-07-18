package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cux implements cuw {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public cux(cuu cuuVar) {
        ClipData clipData = cuuVar.a;
        clipData.getClass();
        this.a = clipData;
        this.b = cuuVar.b;
        this.c = cuuVar.c;
        this.d = cuuVar.d;
        this.e = cuuVar.e;
    }

    @Override // defpackage.cuw
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cuw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cuw
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.cuw
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD");
        sb.append(", flags=");
        sb.append(1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT");
        Uri uri = this.d;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb.append(str);
        sb.append(this.e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
