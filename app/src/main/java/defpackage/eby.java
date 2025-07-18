package defpackage;

import android.graphics.drawable.ColorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eby extends ColorDrawable implements ebz {
    public eby(int i) {
        super(i);
    }

    @Override // defpackage.ebz
    public final boolean a(ebz ebzVar) {
        if (this == ebzVar) {
            return true;
        }
        return (ebzVar instanceof eby) && getColor() == ((eby) ebzVar).getColor();
    }
}
