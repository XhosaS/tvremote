package defpackage;

import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qve extends qvd {
    final /* synthetic */ qvf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qve(qvf qvfVar) {
        super(qvfVar);
        this.b = qvfVar;
    }

    @Override // defpackage.qvd
    public final void a(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        qvf qvfVar = this.b;
        qvfVar.m.setVisibility(0);
        MaterialButton materialButton = qvfVar.j;
        qvf.f(materialButton);
        MaterialButton materialButton2 = qvfVar.k;
        qvf.f(materialButton2);
        materialButton.setGravity(17);
        materialButton2.setGravity(17);
        MaterialButton materialButton3 = qvfVar.l;
        materialButton3.setGravity(17);
        if (materialButton3.getVisibility() == 0) {
            qvf.f(materialButton3);
            qvfVar.n.setVisibility(0);
        }
        rrx.af(constraintLayout, new int[][]{new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_separator1}, new int[]{R.id.og_tos_button}, new int[]{R.id.og_separator2}, new int[]{R.id.og_custom_button}});
    }
}
