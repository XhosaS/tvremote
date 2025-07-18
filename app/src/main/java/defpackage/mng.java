package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mng extends drn {
    final mni a;
    public final BitSet d;
    private final String[] e;

    public mng(dru druVar, mni mniVar) {
        super(druVar, mniVar);
        this.e = new String[]{"commandResolver", "conversionContext", "dataLayerSelector", "editableTextType", "enableAndroidEditableTextRestrictEmojis", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
        BitSet bitSet = new BitSet(12);
        this.d = bitSet;
        this.a = mniVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(12, this.d, this.e);
        return this.a;
    }
}
