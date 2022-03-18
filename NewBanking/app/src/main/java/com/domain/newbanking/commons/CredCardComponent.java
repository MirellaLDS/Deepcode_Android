package com.domain.newbanking.commons;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.domain.newbanking.R;
import com.domain.newbanking.databinding.CreditCardLayoutBinding;

public class CredCardComponent extends ConstraintLayout {

    private CreditCardLayoutBinding viewBind;

    private String balance = "";
    @DrawableRes
    private int bandeira;
    private String validade = "";

    public CredCardComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context, attrs);
        initControl(context);
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        int[] sets = {R.attr.balanceText, R.attr.validadeText, R.attr.bandeiraIcon};
        TypedArray typedArray = context.obtainStyledAttributes(attrs, sets);

        CharSequence balanceValue = typedArray.getText(0);
        CharSequence validadeValue = typedArray.getText(1);
        int bandeiraValue  = attrs.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", 0);
        typedArray.recycle();

        setBalance(balanceValue);
        setValidade(validadeValue);
        setBandeira(bandeiraValue);
    }

    private void initControl(Context context) {
        viewBind = CreditCardLayoutBinding.inflate(LayoutInflater.from(context), this, false);
        addView(viewBind.getRoot());

        viewBind.tvBalance.setText(balance);
        viewBind.tvShelfLife.setText(validade);
        viewBind.ivBandeira.setImageResource(bandeira);
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(CharSequence balance) {
        this.balance = balance.toString();
    }

    public int getBandeira() {
        return bandeira;
    }

    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(CharSequence validade) {
        this.validade = validade.toString();
    }
}
