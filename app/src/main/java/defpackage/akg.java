package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akg extends InputConnectionWrapper {
    final /* synthetic */ akf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akg(InputConnection inputConnection, akf akfVar) {
        super(inputConnection, false);
        this.a = akfVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        aki akiVar = inputContentInfo == null ? null : new aki(new akh(inputContentInfo));
        akf akfVar = this.a;
        if ((i & 1) != 0) {
            try {
                akiVar.a.a.requestPermission();
                InputContentInfo inputContentInfo2 = akiVar.a.a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = akiVar.a.a;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        afq afpVar = Build.VERSION.SDK_INT >= 31 ? new afp(clipData, 2) : new afr(clipData, 2);
        View view = akfVar.a;
        afpVar.d(inputContentInfo3.getLinkUri());
        afpVar.b(bundle2);
        if (ahj.c(view, afpVar.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
