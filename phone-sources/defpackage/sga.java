package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sga {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i, Intent intent) {
        sij.o(true, "Cannot set any dangerous parts of intent to be mutable.");
        sij.o(true, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        sij.o(true, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        sij.o(true, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        sij.o(true, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        sij.o(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            sij.o(!b(67108864, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            sij.o(b(67108864, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!b(67108864, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return PendingIntent.getActivity(context, i, intent2, 67108864);
    }

    private static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
