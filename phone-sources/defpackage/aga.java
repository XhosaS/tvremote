package defpackage;

import android.R;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aga {
    public static final aga a;
    public static final aga b;
    public static final aga c;
    public static final aga d;
    public static final aga e;
    private static final /* synthetic */ aga[] i;
    public final Object f;
    public final int g;
    public final int h;

    static {
        aga agaVar = new aga("Cut", 0, agm.a, R.string.cut, R.attr.actionModeCutDrawable);
        a = agaVar;
        aga agaVar2 = new aga("Copy", 1, agm.b, R.string.copy, R.attr.actionModeCopyDrawable);
        b = agaVar2;
        aga agaVar3 = new aga("Paste", 2, agm.c, R.string.paste, R.attr.actionModePasteDrawable);
        c = agaVar3;
        aga agaVar4 = new aga("SelectAll", 3, agm.d, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        d = agaVar4;
        aga agaVar5 = new aga("Autofill", 4, agm.e, Build.VERSION.SDK_INT <= 26 ? com.google.android.videos.R.string.autofill : R.string.autofill, 0);
        e = agaVar5;
        aga[] agaVarArr = {agaVar, agaVar2, agaVar3, agaVar4, agaVar5};
        i = agaVarArr;
        wcq.P(agaVarArr);
    }

    private aga(String str, int i2, Object obj, int i3, int i4) {
        this.f = obj;
        this.g = i3;
        this.h = i4;
    }

    public static aga[] values() {
        return (aga[]) i.clone();
    }
}
