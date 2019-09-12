package com.kiwibot.kiwiu.models

import com.github.caeus.sumba.With

@With
case class CreateAddressRequest(id:Option[String])


@With
case class CreateAddressResponse(id:Option[String])