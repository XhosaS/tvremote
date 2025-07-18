package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikw extends bf {
    @Override // defpackage.bf
    public final Dialog m() {
        bw bwVarEe = ee();
        if (bwVarEe == null) {
            throw new IllegalStateException("Activity cannot be null");
        }
        Bundle bundleEa = ea();
        String string = bundleEa.getString("info_dialog_title", "");
        string.getClass();
        String string2 = bundleEa.getString("info_dialog_content_header", "");
        string2.getClass();
        String string3 = bundleEa.getString("info_dialog_content_body", "");
        string3.getClass();
        return new ikv(bwVarEe, string, string2, string3);
    }
}
