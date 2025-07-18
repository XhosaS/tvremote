package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnm extends drn {
    final mnp a;
    public final BitSet d;
    private final String[] e;

    public mnm(dru druVar, mnp mnpVar) {
        super(druVar, mnpVar);
        this.e = new String[]{"commandResolver", "conversionContext", "dataLayerSelector", "editableTextType", "enableEmojiCompat", "imageSourceExtensionResolver", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
        BitSet bitSet = new BitSet(13);
        this.d = bitSet;
        this.a = mnpVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(13, this.d, this.e);
        return this.a;
    }
}
