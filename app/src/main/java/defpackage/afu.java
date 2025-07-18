package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afu implements aft {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public afu(afr afrVar) {
        ClipData clipData = afrVar.a;
        clipData.getClass();
        this.a = clipData;
        this.b = afrVar.b;
        this.c = afrVar.c;
        this.d = afrVar.d;
        this.e = afrVar.e;
    }

    @Override // defpackage.aft
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aft
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aft
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.aft
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
