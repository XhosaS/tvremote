package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chu extends chs {
    private final CharSequence a;
    private final BreakIterator b;

    public chu(CharSequence charSequence) {
        this.a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.chs
    public final int a(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.chs
    public final int d(int i) {
        return this.b.preceding(i);
    }
}
